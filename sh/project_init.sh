#!/usr/bin/env bash

# example:
# project_init.sh mock-everything /Users/darian/WebstormProjects

# first param
project_parent_directory=$1
# second param
project_name=$2
github_gitee_name=mock-everything

# project_name=mock-everything

# first into the parent_directory
cd ${project_parent_directory}
mkdir ${project_name}
cd ${project_name}
git init
git remote add gitee git@gitee.com:${github_gitee_name}/${project_name}.git
git remote add github git@github.com:${github_gitee_name}/${project_name}.git
git pull gitee master
git pull github master