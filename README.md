# ClojureScript on Cloud Foundry
By combining <https://gist.github.com/1171737> with the instructions provided by the (http://support.cloudfoundry.com/entries/505133-deploying-a-node-js-app-with-npm-dependencies], writing a node.js + express webapp ready for deployment on Cloud Foundry with ClojureScript is pretty straight forward.

# Compile, package and deploy
Follow these steps:
1. Package with `npm install`
2. Compile with `cljsc hello.cljs "{:target :nodejs}" > hello.js`
3. Deploy with `vmc push [appname]` (you'll have to select application type Node manually)
4. Browse to [appname].cloudfoundry.com
