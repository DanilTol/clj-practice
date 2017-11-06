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
    
(deftest sqrt-sum-sq-test
  (testing "sqrt-sum-sq function."
    (is (= 16.881943016134134 (app/sqrt-sum-sq test-vector)))))

(deftest sort-sin-test
  (testing "sort-sin function."
    (is (= [5 4 6 0 3 9 7 1 2 8] (app/sort-sin test-vector)))))

(deftest sort-length-test
  (let [short [1 2 3]
        medium [2 3 4 5 6]
        large [5 6 7 8 9 10]]
    (testing "sort-length function."
      (is (= (list large medium short) (app/sort-length short large medium))))))
  
(deftest sqrt-sum-sq-a-test
  (testing "sqrt-sum-sq-a function."
    (is (= 16.881943016134134 (app/sqrt-sum-sq-a test-vector)))))
