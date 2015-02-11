/*
 * Copyright (C) 2009 Teleca Poland Sp. z o.o. <android@teleca.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package iiijiaban.foodtherapy.db.dao;

import iiijiaban.foodtherapy.db.DatabaseHelper;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

/**
 * Database builder template - facilitates adding and getting
 * objects from SQLite database
 * 
 * @author Lukasz Wisniewski
 *
 * @param <T>
 */
public abstract class BaseDao<T> {
	
	public DatabaseHelper dbHelper;
	public Context context = null;
	/**
	 * Creates object out of cursor
	 * 
	 * @param c
	 * @return
	 */
	public abstract T build(Cursor c);
	
	/**
	 * Puts an object into a ContentValues instance
	 * 
	 * @param t
	 * @return
	 */
	public abstract ContentValues deconstruct(T t);
	
	public abstract void insert(T t);
	
	public abstract void delete(long id);
	
	public abstract T select(long id);
	
	public abstract ArrayList<T> findAll();
	
	public abstract boolean isExits(long id);

}
