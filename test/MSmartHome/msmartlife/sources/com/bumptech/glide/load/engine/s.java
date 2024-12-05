package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public class s<Data, ResourceType, Transcode> {
    private final Class<Data> a;

    /* renamed from: b, reason: collision with root package name */
    private final c.h.j.g<List<Throwable>> f8597b;

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f8598c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8599d;

    public s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, c.h.j.g<List<Throwable>> gVar) {
        this.a = cls;
        this.f8597b = gVar;
        this.f8598c = (List) com.bumptech.glide.r.j.c(list);
        this.f8599d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private u<Transcode> b(com.bumptech.glide.load.m.e<Data> eVar, com.bumptech.glide.load.i iVar, int i2, int i3, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f8598c.size();
        u<Transcode> uVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                uVar = this.f8598c.get(i4).a(eVar, i2, i3, iVar, aVar);
            } catch (GlideException e2) {
                list.add(e2);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f8599d, new ArrayList(list));
    }

    public u<Transcode> a(com.bumptech.glide.load.m.e<Data> eVar, com.bumptech.glide.load.i iVar, int i2, int i3, i.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.r.j.d(this.f8597b.b());
        try {
            return b(eVar, iVar, i2, i3, aVar, list);
        } finally {
            this.f8597b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f8598c.toArray()) + '}';
    }
}
