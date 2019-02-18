# -*- coding:utf-8 -*-
import mysql.connector
import datasource


def normal(sql):
    conn = mysql.connector.connect(user=datasource.USER, password=datasource.PASSWORD, database=datasource.DATABASE, use_unicode=True)
    cursor = conn.cursor()
    cursor.execute(sql)
    conn.commit()
    cursor.close()
    conn.close()
    print(sql, 'SUCCESS')

