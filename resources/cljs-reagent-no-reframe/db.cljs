(ns $PROJECT_NAME_HYPHENATED$.db
  (:require [clojure.spec.alpha :as s]
            [reagent.core :as r]))

;; spec of app-db
(s/def ::greeting string?)
(s/def ::app-db
  (s/keys :req-un [::greeting]))

;; initial state of app-db
(def app-db {:greeting "Hello Clojure in iOS and Android!"})

(def app-db-atm (r/atom app-db))
