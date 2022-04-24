INSERT INTO TB_CATEGORIA(nome) VALUES ('Informática');
INSERT INTO TB_CATEGORIA(nome) VALUES ('Escritório');

INSERT INTO TB_PRODUTO(nome, preco) VALUES ('Computador', 2000.00);
INSERT INTO TB_PRODUTO(nome, preco) VALUES ('Impressora', 800.00);
INSERT INTO TB_PRODUTO(nome, preco) VALUES ('Mouse', 80.00);

INSERT INTO TB_PRODUTO_CATEGORIA(produto_id, categoria_id) VALUES (1, 1);
INSERT INTO TB_PRODUTO_CATEGORIA(produto_id, categoria_id) VALUES (2, 1);
INSERT INTO TB_PRODUTO_CATEGORIA(produto_id, categoria_id) VALUES (3, 1);
INSERT INTO TB_PRODUTO_CATEGORIA(produto_id, categoria_id) VALUES (2, 2);

INSERT INTO TB_ESTADO (nome) VALUES ('Ceará');
INSERT INTO TB_CIDADE (nome, estado_id) VALUES ('Fortaleza', 1);
INSERT INTO TB_BAIRRO (nome, cidade_id) VALUES ('Vila Velha', 1);

INSERT INTO TB_CLIENTE (nome, email, tipo, birth_date, register_date) VALUES ('Alisson', 'youssfbr@gmail.com', 1, '1977-04-20', now())
INSERT INTO TB_CLIENTE (nome, email, tipo, birth_date, register_date) VALUES ('Ester Mundial', 'ester@mundial.com', 1, '1977-04-20', now())

INSERT INTO TB_TELEFONE (cliente_id, telefones) VALUES (1, '85 99999-9199');
INSERT INTO TB_TELEFONE (cliente_id, telefones) VALUES (1, '85 99999-9299');

INSERT INTO TB_ENDERECO (cep, logradouro, numero, complemento, bairro_id, cliente_id) VALUES ('60.999-999', 'Rua da Tecnologia', '4534', 'Px a algo', 1, 1);
INSERT INTO TB_ENDERECO (cep, logradouro, numero, complemento, bairro_id, cliente_id) VALUES ('60.999-998', 'Av. Havaii', '100', 'PX a praia', 1, 1);

-- PEDIDO
INSERT INTO TB_PEDIDO (instante, cliente_id, endereco_de_entrega_id) VALUES (now(), 1, 1);
INSERT INTO TB_PEDIDO (instante, cliente_id, endereco_de_entrega_id) VALUES (now(), 1, 2);

INSERT INTO TB_PAGAMENTO (estado_pagamento, pedido_id) VALUES (2, 1)
INSERT INTO TB_PAGAMENTO_COM_CARTAO (numero_de_parcelas, pedido_id) VALUES (6, 1);

INSERT INTO TB_PAGAMENTO (estado_pagamento, pedido_id) VALUES (1, 2)
INSERT INTO TB_PAGAMENTO_COM_BOLETO  (data_vencimento, pedido_id) VALUES ('2017-10-20', 2);


