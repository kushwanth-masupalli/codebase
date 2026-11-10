"""
Regularization = is a technique used to prevent overfitting by adding  a
                 penalty to the model's coefficient

it discourages the model from assigning unnecessarily large weights to features

L1 regularization  = Lasso regularization
L2 regularization = Ridge  regularization

difference

Lasso                                  Ridge
L1                                     L2
can make coefficients zero             shrinks coefficients
can eliminate features                 keeps all features
useful when some features are          useful when many features contribute
irrelevant
"""


#Lasso

from sklearn.linear_model import Lasso

model = Lasso(alpha=1.0)
model.fit(X_train, y_train)

y_pred = model.predict(X_test)


#Ridge

from sklearn.linear_model import Ridge

model = Ridge(alpha=1.0)
model.fit(X_train, y_train)

y_pred = model.predict(X_test)