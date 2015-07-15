(ns hello-world.core-test
  (:require
    [cljs.test :refer-macros [deftest testing is]]
    [hello-world.core :as hw]))

(enable-console-print!)

(deftest test-pizza
  (is (= "pizza" "pizza")))

(deftest test-lul
  (is (= 1 1)))

(deftest test-fifth
  (is (= 1 1)))

(deftest test-third
  (is (= 1 1)))

(deftest test-fourth
  (is (= 1 1)))

(deftest test-six
  (is (= 1 1)))
