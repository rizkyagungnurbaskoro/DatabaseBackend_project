-- Insert customers
INSERT INTO customer (first_name, last_name, email, phone) VALUES ('James', 'Dean', 'jd38@gmail.com', '0193899839');
INSERT INTO customer (first_name, last_name, email, phone) VALUES ('Ali', 'James', 'aj112@gmail.com', '0194999890');
INSERT INTO customer (first_name, last_name, email, phone) VALUES ('Samad', 'Bond', 'sb189@gmail.com', '0193783890');
INSERT INTO customer (first_name, last_name, email, phone) VALUES ('Sarip', 'John', 'sj134@gmail.com', '0191297890');

-- Insert rooms
INSERT INTO room (room_type, nights, desc) VALUES ('Single', 1, 'Single room description');
INSERT INTO room (room_type, nights, desc) VALUES ('Double', 2, 'Double room description');
INSERT INTO room (room_type, nights, desc) VALUES ('Suite', 3, 'Suite room description');

-- Insert bookings
INSERT INTO booking (start, end_date, book_date, notes, status, cust_id) VALUES ('2024-06-10', '2024-06-12', '2024-06-08', 'Booking notes 1', 'Confirmed', 1);
INSERT INTO booking (start, end_date, book_date, notes, status, cust_id) VALUES ('2024-07-15', '2024-07-18', '2024-07-10', 'Booking notes 2', 'Confirmed', 2);
INSERT INTO booking (start, end_date, book_date, notes, status, cust_id) VALUES ('2024-08-20', '2024-08-22', '2024-08-18', 'Booking notes 3', 'Pending', 3);
INSERT INTO booking (start, end_date, book_date, notes, status, cust_id) VALUES ('2024-09-25', '2024-09-28', '2024-09-23', 'Booking notes 4', 'Cancelled', 4);

-- Insert payments
INSERT INTO payment (total_price, payment_date, booking_id) VALUES (100.00, '2024-06-08', 1);
INSERT INTO payment (total_price, payment_date, booking_id) VALUES (200.00, '2024-07-10', 2);
INSERT INTO payment (total_price, payment_date, booking_id) VALUES (150.00, '2024-08-18', 3);
INSERT INTO payment (total_price, payment_date, booking_id) VALUES (250.00, '2024-09-23', 4);

-- Insert booking-room relationships
INSERT INTO booking_room (booking_id, room_num) VALUES (1, 1);
INSERT INTO booking_room (booking_id, room_num) VALUES (2, 2);
INSERT INTO booking_room (booking_id, room_num) VALUES (3, 3);
INSERT INTO booking_room (booking_id, room_num) VALUES (4, 1);
