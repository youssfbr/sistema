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
INSERT INTO TB_CIDADE (nome, estado_id) VALUES ('Crato', 1);
INSERT INTO TB_BAIRRO (nome, cidade_id) VALUES ('Vila Velha', 1);

INSERT INTO TB_CLIENTE (nome, email, tipo, birth_date, register_date) VALUES ('Alisson', 'youssfbr@gmail.com', 1, '1977-04-20', now())
INSERT INTO TB_CLIENTE (nome, email, tipo, birth_date, register_date) VALUES ('Ester Mundial', 'ester@mundial.com', 1, '1977-04-20', now())

INSERT INTO TB_TELEFONE (cliente_id, telefones) VALUES (1, '85 99999-9199');
INSERT INTO TB_TELEFONE (cliente_id, telefones) VALUES (1, '85 99999-9299');

INSERT INTO TB_ENDERECO (CEP, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO_ID, CLIENTE_ID) VALUES ('60.999-999', 'Rua da Tecnologia', '4534', 'Px a algo', 1, 1);
INSERT INTO TB_ENDERECO (CEP, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO_ID, CLIENTE_ID) VALUES ('60.999-998', 'Av. Havaii', '100', 'PX a praia', 1, 1);


