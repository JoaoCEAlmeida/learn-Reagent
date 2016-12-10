(ns reagent-begin.prod
  (:require [reagent-begin.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
