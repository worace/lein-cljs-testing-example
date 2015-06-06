(ns hello-world.core-test
  (:require
    [cljs.test :refer-macros [deftest testing is]]
    [hello-world.core :as hw]))

(enable-console-print!)

(deftest test-pizza
  (is (= "pizza" "pizza")))

(deftest test-lul
  (is (= 1 1)))
