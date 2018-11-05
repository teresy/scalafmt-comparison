#!/bin/bash

cd before-test-scalafmt-workspace

find . -name "*.scala" |\
xargs -L 1 -I % \
diff -y --suppress-common-lines % ../before-test-teresy-workspace/%

cd ..
