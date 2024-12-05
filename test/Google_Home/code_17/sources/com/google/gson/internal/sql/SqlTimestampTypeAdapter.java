package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;
import s1.C3990a;
import s1.c;

/* loaded from: classes4.dex */
class SqlTimestampTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final r f18839b = new r() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(gson.l(Date.class));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final TypeAdapter f18840a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(C3990a c3990a) {
        Date date = (Date) this.f18840a.b(c3990a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Timestamp timestamp) {
        this.f18840a.d(cVar, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f18840a = typeAdapter;
    }
}
