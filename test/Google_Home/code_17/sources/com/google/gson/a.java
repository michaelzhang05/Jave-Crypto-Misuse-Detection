package com.google.gson;

import j$.util.Objects;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Field f18605a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f18605a = field;
    }

    public String toString() {
        return this.f18605a.toString();
    }
}
