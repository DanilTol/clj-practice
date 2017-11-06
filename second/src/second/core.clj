(ns second.core
  (:gen-class))

(defn -main [& args]
  (println "There is no BL in main."))

(defn double-list [list]
  (map (fn [x] (* x 2)) list)) 

(defn sub-lists [list1 list2]
  (map - list1 list2))

(defn filter-even [list]
  (filter even? list))

(defn filter-10-100 [list]
  (filter (fn [x] (<= 10 x 100)) list))

(defn sqrt-sum-sq [list]
  (Math/sqrt (reduce + 0 (map (fn [x] (* x x)) list))))
  
(defn sort-sin [list]
  (sort (fn [x y] (< (Math/sin x) (Math/sin y))) list))

(defn sort-length [& lists]
  (sort (fn [x y] (> (count x) (count y))) lists))

(defn sqrt-sum-sq-a [list]
  (Math/sqrt (apply + (map (fn [x] (* x x)) list))))
