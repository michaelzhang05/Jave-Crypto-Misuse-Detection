package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public class TypeParser implements Serializable {
    protected final TypeFactory _factory;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MyTokenizer extends StringTokenizer {
        protected int _index;
        protected final String _input;
        protected String _pushbackToken;

        public MyTokenizer(String str) {
            super(str, "<,>", true);
            this._input = str;
        }

        public String getAllInput() {
            return this._input;
        }

        public String getRemainingInput() {
            return this._input.substring(this._index);
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this._pushbackToken != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this._pushbackToken;
            if (str != null) {
                this._pushbackToken = null;
            } else {
                str = super.nextToken();
            }
            this._index += str.length();
            return str;
        }

        public void pushBack(String str) {
            this._pushbackToken = str;
            this._index -= str.length();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    protected IllegalArgumentException _problem(MyTokenizer myTokenizer, String str) {
        return new IllegalArgumentException("Failed to parse type '" + myTokenizer.getAllInput() + "' (remaining: '" + myTokenizer.getRemainingInput() + "'): " + str);
    }

    protected Class<?> findClass(String str, MyTokenizer myTokenizer) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e2) {
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            }
            throw _problem(myTokenizer, "Can not locate class '" + str + "', problem: " + e2.getMessage());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        MyTokenizer myTokenizer = new MyTokenizer(str.trim());
        JavaType parseType = parseType(myTokenizer);
        if (myTokenizer.hasMoreTokens()) {
            throw _problem(myTokenizer, "Unexpected tokens after complete type");
        }
        return parseType;
    }

    protected JavaType parseType(MyTokenizer myTokenizer) throws IllegalArgumentException {
        if (myTokenizer.hasMoreTokens()) {
            Class<?> findClass = findClass(myTokenizer.nextToken(), myTokenizer);
            if (myTokenizer.hasMoreTokens()) {
                String nextToken = myTokenizer.nextToken();
                if ("<".equals(nextToken)) {
                    return this._factory._fromClass(null, findClass, TypeBindings.create(findClass, parseTypes(myTokenizer)));
                }
                myTokenizer.pushBack(nextToken);
            }
            return this._factory._fromClass(null, findClass, null);
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }

    protected List<JavaType> parseTypes(MyTokenizer myTokenizer) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (myTokenizer.hasMoreTokens()) {
            arrayList.add(parseType(myTokenizer));
            if (!myTokenizer.hasMoreTokens()) {
                break;
            }
            String nextToken = myTokenizer.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                throw _problem(myTokenizer, "Unexpected token '" + nextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }
}
