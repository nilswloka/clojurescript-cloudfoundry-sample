(ns hello
  (:require [cljs.nodejs :as node]))

(. (.paths node/require) (unshift "./node_modules"))

(def express (node/require "express"))
(def app (. express (createServer)))

(defn hello-world [req res]
  (.send res "Hello World!"))

(defn -main [& args]
  (doto app
    (.use (. express (logger)))
    (.get "/" hello-world)
    (.listen (.VMC_APP_PORT (.env node/process))))
  (println (str "Express server started on port: "
                (.port (. app (address))))))

(set! *main-cli-fn* -main)

