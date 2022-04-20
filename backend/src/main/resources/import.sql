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