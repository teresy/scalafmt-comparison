#!/bin/bash

cd before-test-scalafmt-workspace
git checkout -- .
time scalafmt scalafmt/scalafmt-tests/src/test/resources/rewrite/PreferCurlyFors.scala
cd ..

cd before-test-teresy-workspace
git checkout -- .
time ~/rooibos-future/main -d . -filter .scala -template `echo ~/rooibos-future/catalogue/scala/scalafmt/rewrite-rules/prefer-curly-fors | tr ' ' ','`
echo 'Normalizing newlines with scalafmt...'
scalafmt scalafmt/scalafmt-tests/src/test/resources/rewrite/PreferCurlyFors.scala
cd ..

EQUAL=`./diff-teresy-vs-scalafmt.sh`

echo "Diffs" ${EQUAL}

git checkout -- .
