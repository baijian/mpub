(defproject mpub "0.1.0-SNAPSHOT"
  :description "publish codes to several machines in multi-threads"
  :url "http://example.com/FIXME"
  :license {:name "The MIT License"
            :url ""}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.3.1"]
                 [clj-time "0.6.0"]]
  :main ^:skip-aot mpub.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
