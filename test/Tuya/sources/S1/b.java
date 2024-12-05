package S1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected Field f8944a;

    /* renamed from: b, reason: collision with root package name */
    protected Method f8945b;

    /* renamed from: c, reason: collision with root package name */
    protected Method f8946c;

    /* renamed from: d, reason: collision with root package name */
    protected Class f8947d;

    /* renamed from: e, reason: collision with root package name */
    protected Type f8948e;

    /* renamed from: f, reason: collision with root package name */
    protected String f8949f;

    public b(Class cls, Field field, j jVar) {
        String c8;
        this.f8949f = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.f8944a = field;
        }
        try {
            this.f8945b = cls.getDeclaredMethod(a.e(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean equals = field.getType().equals(Boolean.TYPE);
        if (equals) {
            c8 = a.d(field.getName());
        } else {
            c8 = a.c(field.getName());
        }
        try {
            this.f8946c = cls.getDeclaredMethod(c8, null);
        } catch (Exception unused2) {
        }
        if (this.f8946c == null && equals) {
            try {
                this.f8946c = cls.getDeclaredMethod(a.c(field.getName()), null);
            } catch (Exception unused3) {
            }
        }
        if (this.f8944a == null && this.f8946c == null && this.f8945b == null) {
            return;
        }
        Method method = this.f8946c;
        if (method != null && !jVar.a(field, method)) {
            this.f8946c = null;
        }
        Method method2 = this.f8945b;
        if (method2 != null && !jVar.a(field, method2)) {
            this.f8945b = null;
        }
        if (this.f8946c == null && this.f8945b == null && this.f8944a == null) {
            return;
        }
        this.f8947d = field.getType();
        this.f8948e = field.getGenericType();
    }

    public String a() {
        return this.f8949f;
    }

    public Class b() {
        return this.f8947d;
    }

    public boolean c() {
        return this.f8947d.isEnum();
    }

    public boolean d() {
        if (this.f8945b == null && this.f8946c == null) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f8944a == null && this.f8946c == null) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (this.f8944a == null && this.f8946c == null && this.f8945b == null) {
            return false;
        }
        return true;
    }

    public boolean g() {
        if (this.f8944a == null && this.f8946c == null) {
            return false;
        }
        return true;
    }
}
