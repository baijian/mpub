(ns mpub.core
  (:use [clojure.java.shell :only (sh)])
  (:use clj-time.format)
  (:use clj-time.local)
  (:require [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(def cli-options
  [["-p" "--project PROJECT" "Project name"]
   ["-v" "--version VERSION" 
    :default (str (unparse (formatter "yyyyMMdd") (local-now)) "00")]])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [{:keys [options arguments errors summary]} (parse-opts args cli-options)]
    (println (:project options))
    (println (:version options))))
