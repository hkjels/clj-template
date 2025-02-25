(ns {{base}}.python
    (:require [libpython-clj2.python :as py]))

(defn initialize-python!
  ([] (py/initialize!))
  ([python-executable]
   (py/initialize! :python-executable python-executable)))


;; If you are using environments, you can specialized which python executable
;; you bind to below.  Make sure you do this before you call 'require-python'
;; in any file.

;; (initialize-python! "/path/to/env/bin/python")
(initialize-python! "python3")
