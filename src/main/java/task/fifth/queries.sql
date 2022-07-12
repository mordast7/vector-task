select *
from products
where product_name like 'C%';

select *
from products
order by price
    limit 1;

select sum(price) as price
from products p
         join suppliers s on p.supplier_id = s.id
where s.country = 'USA';

select s.id, s.city, s.country
from suppliers s
         join products p on s.id = p.supplier_id
         join categories c on p.category_id = c.id
where c.category_name = 'Condiments';


INSERT INTO `my_shop`.`suppliers` (`supplier_name`, `city`, `country`) VALUES ('‘Norske Meierier', 'Lviv', 'Ukraine');
INSERT INTO `my_shop`.`products` (`product_name`, `supplier_id`, `category_id`, `price`) VALUES ('Green tea', '6', '1', '10');
