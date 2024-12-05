package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes2.dex */
public abstract class j {
    public g a() {
        if (o()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public l b() {
        if (x()) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public m f() {
        if (z()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean o() {
        return this instanceof g;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            com.google.gson.stream.c cVar = new com.google.gson.stream.c(stringWriter);
            cVar.u0(true);
            com.google.gson.t.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean w() {
        return this instanceof k;
    }

    public boolean x() {
        return this instanceof l;
    }

    public boolean z() {
        return this instanceof m;
    }
}
