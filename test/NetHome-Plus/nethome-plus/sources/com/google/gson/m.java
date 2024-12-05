package com.google.gson;

import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes2.dex */
public final class m extends j {
    private static final Class<?>[] a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b, reason: collision with root package name */
    private Object f16845b;

    public m(Boolean bool) {
        U(bool);
    }

    private static boolean Q(m mVar) {
        Object obj = mVar.f16845b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    private static boolean S(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean D() {
        if (P()) {
            return J().booleanValue();
        }
        return Boolean.parseBoolean(O());
    }

    Boolean J() {
        return (Boolean) this.f16845b;
    }

    public double K() {
        return R() ? N().doubleValue() : Double.parseDouble(O());
    }

    public int L() {
        return R() ? N().intValue() : Integer.parseInt(O());
    }

    public long M() {
        return R() ? N().longValue() : Long.parseLong(O());
    }

    public Number N() {
        Object obj = this.f16845b;
        return obj instanceof String ? new com.google.gson.t.g((String) this.f16845b) : (Number) obj;
    }

    public String O() {
        if (R()) {
            return N().toString();
        }
        if (P()) {
            return J().toString();
        }
        return (String) this.f16845b;
    }

    public boolean P() {
        return this.f16845b instanceof Boolean;
    }

    public boolean R() {
        return this.f16845b instanceof Number;
    }

    public boolean T() {
        return this.f16845b instanceof String;
    }

    void U(Object obj) {
        if (obj instanceof Character) {
            this.f16845b = String.valueOf(((Character) obj).charValue());
        } else {
            com.google.gson.t.a.a((obj instanceof Number) || S(obj));
            this.f16845b = obj;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f16845b == null) {
            return mVar.f16845b == null;
        }
        if (Q(this) && Q(mVar)) {
            return N().longValue() == mVar.N().longValue();
        }
        Object obj2 = this.f16845b;
        if ((obj2 instanceof Number) && (mVar.f16845b instanceof Number)) {
            double doubleValue = N().doubleValue();
            double doubleValue2 = mVar.N().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        }
        return obj2.equals(mVar.f16845b);
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f16845b == null) {
            return 31;
        }
        if (Q(this)) {
            doubleToLongBits = N().longValue();
        } else {
            Object obj = this.f16845b;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(N().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public m(Number number) {
        U(number);
    }

    public m(String str) {
        U(str);
    }
}
