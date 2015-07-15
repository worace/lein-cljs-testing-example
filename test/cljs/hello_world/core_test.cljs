(ns ^:figwheel-always hello-world.core-test
  (:require
    [cljs.test :refer-macros [deftest testing is]]
    [hello-world.core :as hw]))

(enable-console-print!)

(deftest test-pizza
  (is (= "pizza" "pizza")))

(deftest test-four
  (is (= 1 1)))

(deftest test-five
  (is (= 1 1)))

(deftest test-tacos
  (is (= 1 1)))

(defn run-tests []
  (.clear js/console)
  (cljs.test/run-all-tests #"hello-world.*-test"))
(run-tests)
