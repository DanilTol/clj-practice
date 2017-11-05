(ns second.core-test
  (:require [clojure.core :refer :all]
            [clojure.test :refer :all]
            [second.core :as app]))

(def test-vector (range 10))

(deftest double-list-test
  (let [min-value (apply min test-vector)
        max-value (apply max test-vector)
        test-output (range min-value (-> max-value inc (* 2)) 2)]
    (testing "double-list function."
      (-> test-vector app/double-list (= test-output) is))))

(deftest sub-lists-test
  (let [test-output (-> test-vector count (replicate 0) vec)]
    (testing "sub-lists function."
      (-> test-vector (app/sub-lists test-vector) (= test-output) is))))

(deftest filter-even-test
    (testing "filter-even function."
      (is (every? even? (app/filter-even test-vector)))))

(deftest filter-10-100-test
  (let [test-input [5 10 20 100 150]
        test-output [10 20 100]]
    (testing "filter-10-100 function."
      (is (= test-output (app/filter-10-100 test-input))))))
    