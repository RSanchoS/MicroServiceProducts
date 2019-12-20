-- Insert rows into table 'brands'
INSERT INTO brands
( -- columns to insert data into
 brand_name, foundation_date
)
VALUES
( -- first row: values for the columns in the list above
 'Brand 1', '2000-12-20T00:01:00Z'
),
( -- second row: values for the columns in the list above
 'Brand 2', '2000-12-20T00:01:00Z'
);

-- Insert rows into table 'typeCars'
INSERT INTO type_car
( -- columns to insert data into
    type_card_name
)
VALUES
( -- first row: values for the columns in the list above
    'type_card_name 1'
),
( -- second row: values for the columns in the list above
    'type_card_name 2'
);

-- Insert rows into table ''
INSERT INTO type_engine
( -- columns to insert data into
 type_engine_name
)
VALUES
( -- first row: values for the columns in the list above
 'type_engine_name 1'
),
( -- second row: values for the columns in the list above
 'type_engine_name 2'
);

-- Insert rows into table 'manufacturing_detail'
INSERT INTO manufacturing_detail
( -- columns to insert data into
    manufacturing_date
)
VALUES
( -- first row: values for the columns in the list above
 '2019-12-25T00:01:00Z'
),
( -- second row: values for the columns in the list above
 '2019-12-26T00:01:00Z'
);

-- Insert rows into table 'engines'
INSERT INTO engines
( -- columns to insert data into
 engine_name, cv, id_type_engine
)
VALUES
( -- first row: values for the columns in the list above
    'engine 1', 90, 1
),
( -- second row: values for the columns in the list above
    'engine 2', 120, 2
);

-- Insert rows into table 'cars'
INSERT INTO cars
( -- columns to insert data into
    model_name, release_date, id_brand, id_type_car,
    id_manufacturing_detail
)
VALUES
( -- first row: values for the columns in the list above
    'Model 1', '2019-12-20T00:01:00Z', 1, 1, 1
),
( -- second row: values for the columns in the list above
    'Model 2', '2019-12-20T00:01:00Z', 2, 2, 2
),
( -- second row: values for the columns in the list above
    'Model 3', '2019-12-20T00:01:00Z', 1, 2, 1
),
( -- second row: values for the columns in the list above
    'Model 4', '2019-12-20T00:01:00Z', 2, 1, 1
);

-- Insert rows into table 'car_engine'
INSERT INTO car_engine
( -- columns to insert data into
    id_car, id_engine
)
VALUES
( -- first row: values for the columns in the list above
  1, 1
),
( -- second row: values for the columns in the list above
    1, 2
), 
(
    2, 2
);
