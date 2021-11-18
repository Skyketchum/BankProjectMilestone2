create table if not EXISTS employee(

employee_User_id SERIAL primary key,
employee_username VARCHAR(50),
employee_password VARCHAR(50),
employee_login_info_check BOOLEAN,
first_name VARCHAR(50),
last_name VARCHAR(50)


);

create table if not EXISTS customer(
customer_User_id SERIAL primary key,
customer_username VARCHAR(50),
customer_password VARCHAR(50),
login_info_check BOOLEAN,
first_name VARCHAR(50),
last_name VARCHAR(50),
account_balance DECIMAL,
does_Qualify_For_Loan BOOLEAN

);


create table if not exists account(
customer_Account_User_id SERIAL primary key,
account_balance DECIMAL,
current_balance DECIMAL,
withdrawal_amount DECIMAL,
deposit_amount DECIMAL,
can_make_withdrawal BOOLEAN


);

create table if not exists transactions(

recent_purchases DECIMAL,
recent_payments DECIMAL,
money_received DECIMAL,
money_sent DECIMAL,
active_purchase DECIMAL,
can_purchase BOOLEAN

);