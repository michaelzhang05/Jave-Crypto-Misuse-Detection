package com.liulishuo.filedownloader.exception;

import e.h.a.k0.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class FileDownloadHttpException extends IOException {

    /* renamed from: f, reason: collision with root package name */
    private final int f17145f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, List<String>> f17146g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, List<String>> f17147h;

    public FileDownloadHttpException(int i2, Map<String, List<String>> map, Map<String, List<String>> map2) {
        super(f.o("response code error: %d, \n request headers: %s \n response headers: %s", Integer.valueOf(i2), map, map2));
        this.f17145f = i2;
        this.f17146g = a(map);
        this.f17147h = a(map);
    }

    private static Map<String, List<String>> a(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return hashMap;
    }

    public int b() {
        return this.f17145f;
    }
}
