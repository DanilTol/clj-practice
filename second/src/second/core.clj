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
