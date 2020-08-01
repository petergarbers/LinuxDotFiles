{:user {:plugins [ [refactor-nrepl "2.5.0"]]
        :dependencies [[philoskim/debux "0.4.7"]
                       [vvvvalvalval/scope-capture "0.1.4"]
                       [im.chit/lucid.core.inject "1.3.13"]
                       [molecule "0.1.1-SNAPSHOT"]
                       [spec-provider "0.4.14"]]
        :repl-options {:init (set! *print-length* 500)
                       ;;:nrepl-middleware [cider.piggieback/wrap-cljs-repl]
                       :timeout 120000}
        ;; injections used with lucid.core.inject to make certain code available in every ns
        :injections [(require '[lucid.core.inject :as inject]
                              'sc.api)
                     (use 'debux.core)
                     (inject/in
                      clojure.core
                      [clojure.pprint pprint pp]
                      [clojure.repl source doc])]}}
