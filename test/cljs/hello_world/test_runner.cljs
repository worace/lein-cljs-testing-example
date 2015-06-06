(ns ^:figwheel-always hello-world.test-runner
  (:require
   [cljs.test :as test :include-macros true :refer [report]]
   [hello-world.test-formatter :as formatter]
   [hello-world.core-test]
   [figwheel.client :as fw]))

(enable-console-print!)

(defn runner []
  (test/run-tests
   'hello-world.core-test))

;; invoke the runner so tests will run on
;; initial page load
(runner)

;; FW connection is optional in order to simply run tests,
;; but is needed to connect to the FW repl and to allow
;; auto-reloading on file-save
(fw/start {
           :websocket-url "ws://localhost:3449/figwheel-ws"
           ;; :autoload false
           :build-id "test"
           :on-jsload (fn [] (runner))})
