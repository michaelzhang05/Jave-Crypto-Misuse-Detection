package com.google.gson;

import j$.util.Objects;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class k extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18847a;

    public k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f18847a = bool;
    }

    private static boolean q(k kVar) {
        Object obj = kVar.f18847a;
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
        if (this.f18847a == null) {
            if (kVar.f18847a == null) {
                return true;
            }
            return false;
        }
        if (q(this) && q(kVar)) {
            if (n().longValue() == kVar.n().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.f18847a;
        if ((obj2 instanceof Number) && (kVar.f18847a instanceof Number)) {
            double doubleValue = n().doubleValue();
            double doubleValue2 = kVar.n().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return obj2.equals(kVar.f18847a);
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f18847a == null) {
            return 31;
        }
        if (q(this)) {
            doubleToLongBits = n().longValue();
        } else {
            Object obj = this.f18847a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(n().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean m() {
        if (p()) {
            return ((Boolean) this.f18847a).booleanValue();
        }
        return Boolean.parseBoolean(o());
    }

    public Number n() {
        Object obj = this.f18847a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new com.google.gson.internal.f((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String o() {
        Object obj = this.f18847a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (r()) {
            return n().toString();
        }
        if (p()) {
            return ((Boolean) this.f18847a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f18847a.getClass());
    }

    public boolean p() {
        return this.f18847a instanceof Boolean;
    }

    public boolean r() {
        return this.f18847a instanceof Number;
    }

    public boolean t() {
        return this.f18847a instanceof String;
    }

    public k(Number number) {
        Objects.requireNonNull(number);
        this.f18847a = number;
    }

    public k(String str) {
        Objects.requireNonNull(str);
        this.f18847a = str;
    }
}
