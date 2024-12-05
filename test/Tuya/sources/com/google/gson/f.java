package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public abstract class f {
    public d a() {
        if (h()) {
            return (d) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public i d() {
        if (l()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public k g() {
        if (m()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean h() {
        return this instanceof d;
    }

    public boolean i() {
        return this instanceof h;
    }

    public boolean l() {
        return this instanceof i;
    }

    public boolean m() {
        return this instanceof k;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            p1.c cVar = new p1.c(stringWriter);
            cVar.J(true);
            com.google.gson.internal.l.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
