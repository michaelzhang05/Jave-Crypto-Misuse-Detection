package com.google.gson;

import j$.util.Objects;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class k extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f17792a;

    public k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f17792a = bool;
    }

    private static boolean t(k kVar) {
        Object obj = kVar.f17792a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f17792a == null) {
            if (kVar.f17792a == null) {
                return true;
            }
            return false;
        }
        if (t(this) && t(kVar)) {
            if (q().longValue() == kVar.q().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.f17792a;
        if ((obj2 instanceof Number) && (kVar.f17792a instanceof Number)) {
            double doubleValue = q().doubleValue();
            double doubleValue2 = kVar.q().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return obj2.equals(kVar.f17792a);
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f17792a == null) {
            return 31;
        }
        if (t(this)) {
            doubleToLongBits = q().longValue();
        } else {
            Object obj = this.f17792a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(q().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean p() {
        if (s()) {
            return ((Boolean) this.f17792a).booleanValue();
        }
        return Boolean.parseBoolean(r());
    }

    public Number q() {
        Object obj = this.f17792a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new com.google.gson.internal.f((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String r() {
        Object obj = this.f17792a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (u()) {
            return q().toString();
        }
        if (s()) {
            return ((Boolean) this.f17792a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f17792a.getClass());
    }

    public boolean s() {
        return this.f17792a instanceof Boolean;
    }

    public boolean u() {
        return this.f17792a instanceof Number;
    }

    public boolean v() {
        return this.f17792a instanceof String;
    }

    public k(Number number) {
        Objects.requireNonNull(number);
        this.f17792a = number;
    }

    public k(String str) {
        Objects.requireNonNull(str);
        this.f17792a = str;
    }
}
