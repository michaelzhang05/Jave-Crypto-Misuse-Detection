package com.capacitorjs.plugins.network;

import org.apache.cordova.networkinformation.NetworkManager;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4238a = false;

    /* renamed from: b, reason: collision with root package name */
    public a f4239b = a.NONE;

    /* loaded from: classes.dex */
    public enum a {
        WIFI("wifi"),
        CELLULAR(NetworkManager.CELLULAR),
        NONE(NetworkManager.TYPE_NONE),
        UNKNOWN(NetworkManager.TYPE_UNKNOWN);


        /* renamed from: a, reason: collision with root package name */
        private String f4245a;

        a(String str) {
            this.f4245a = str;
        }

        public String b() {
            return this.f4245a;
        }
    }
}
