package com.getcapacitor.community.database.sqlite;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Map f4341a;

    public Map a() {
        return this.f4341a;
    }

    public void b(Map map) {
        this.f4341a = map;
    }

    @Override // java.lang.Runnable
    public abstract void run();
}
