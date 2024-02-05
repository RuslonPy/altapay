-- Users
INSERT INTO users (id, dob, dt, email, fio, phone, status)
VALUES
(1, '2021-11-11', '2023-12-31', 'test@mail.com', 'Vasiliy Ivanov', '998999876543', 1),
(2, '2021-11-11', '2023-12-31', 'test@mail.com', 'Ruslan', '998999876543', 1);

-- Cards
INSERT INTO cards (id, user_id, balance, card_expire, card_name, card_type, card_number, dt, status)
VALUES
(1, 1, '5000', '07/26', 'test', 'UZ', '8600987645674321', '2024-01-11 19:00:00', 1),
(2, 2, '4234234', '07/26', 'testtest', 'UZ', '8600987645674321', '2024-01-11 19:00:00', 1);

-- Card Transactions
-- Insert data into the card_transactions table
INSERT INTO cards_transactions (id, card_id, amount, dt, new_balance, old_balance, type)
VALUES
(1, 1, '1000', '2024-01-09 19:00:00', '5000', '5100', 'DEBIT'),
(2, 2, '123123', '2024-01-09 19:00:00', '324234', '3241234234', 'DEBIT'),
(3, 2, '12000', '2024-01-09 19:00:00', '23000', '23400', 'CREDIT');

