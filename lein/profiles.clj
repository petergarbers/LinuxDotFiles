{:user {:plugins [[lein-drip "0.1.2-SNAPSHOT"]
                  [com.jakemccrary/lein-test-refresh "0.14.0"]
                  [venantius/yagni "0.1.4"]
                  [lein-ns-dep-graph "0.2.0-SNAPSHOT"]
                  [lein-kibit "0.1.3"]
                  [jonase/eastwood "0.2.3"]
                  [refactor-nrepl "2.4.0-SNAPSHOT"]
                  [cider/cider-nrepl "0.21.1"]]
        :dependencies [[clj-stacktrace "0.2.8"]
                       [philoskim/debux "0.4.7"]
                       [vvvvalvalval/scope-capture "0.1.4"]
                       [pjstadig/humane-test-output "0.8.3"]
                       [im.chit/lucid.core.inject "1.3.6"]
                       [mvxcvi/puget "1.0.0"]
                       [molecule "0.1.1-SNAPSHOT"]
                       [cider/piggieback "0.4.1"]
                       [spec-provider "0.4.14"]
                       [org.clojure/tools.nrepl "0.2.12"]]
        :repl-options {:init (set! *print-length* 500)
                       :nrepl-middleware [cider.piggieback/wrap-cljs-repl]
                       :timeout 120000}
        ;; injections used with lucid.core.inject to make certain code available in every ns
        :injections [(require '[lucid.core.inject :as inject]
                              'sc.api)
                     (use 'debux.core)
                     (inject/in
                      clojure.core
                      [clojure.pprint pprint pp]
                      [clojure.repl source doc])]}}
