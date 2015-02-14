(ns hface.tools)

(defn to-css-class 
  "keyword to CSS class. e.g. :chart to '.chart'"
  [k]
  (->> k name (str ".")))

(defn every [ms f]
  (js/setInterval f ms))

(defn info [& m]
  (.log js/console (clj->js m)))
