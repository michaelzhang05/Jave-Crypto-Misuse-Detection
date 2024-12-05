package io.rakam.api;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: DeviceInfo.java */
/* loaded from: classes2.dex */
public class d {
    private boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    private Context f18450b;

    /* renamed from: c, reason: collision with root package name */
    private b f18451c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceInfo.java */
    /* loaded from: classes2.dex */
    public class b {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f18452b;

        /* renamed from: c, reason: collision with root package name */
        private String f18453c;

        /* renamed from: d, reason: collision with root package name */
        private String f18454d;

        /* renamed from: e, reason: collision with root package name */
        private String f18455e;

        /* renamed from: f, reason: collision with root package name */
        private String f18456f;

        /* renamed from: g, reason: collision with root package name */
        private String f18457g;

        /* renamed from: h, reason: collision with root package name */
        private String f18458h;

        /* renamed from: i, reason: collision with root package name */
        private String f18459i;

        /* renamed from: j, reason: collision with root package name */
        private String f18460j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f18461k;
        private boolean l;

        private String A() {
            return Build.VERSION.RELEASE;
        }

        private String B() {
            try {
                return d.this.f18450b.getPackageManager().getPackageInfo(d.this.f18450b.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                e.e().g("Failed to get version name", e2);
                return null;
            }
        }

        private boolean m() {
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, d.this.f18450b);
                if (num != null) {
                    return num.intValue() == 0;
                }
                return false;
            } catch (ClassNotFoundException e2) {
                h.d().g("io.rakam.api.DeviceInfo", "Google Play Services Util not found!");
                e.e().g("Failed to check GPS enabled", e2);
                return false;
            } catch (IllegalAccessException e3) {
                h.d().g("io.rakam.api.DeviceInfo", "Google Play Services not available");
                e.e().g("Failed to check GPS enabled", e3);
                return false;
            } catch (NoClassDefFoundError e4) {
                h.d().g("io.rakam.api.DeviceInfo", "Google Play Services Util not found!");
                e.e().g("Failed to check GPS enabled", e4);
                return false;
            } catch (NoSuchMethodException e5) {
                h.d().g("io.rakam.api.DeviceInfo", "Google Play Services not available");
                e.e().g("Failed to check GPS enabled", e5);
                return false;
            } catch (InvocationTargetException e6) {
                h.d().g("io.rakam.api.DeviceInfo", "Google Play Services not available");
                e.e().g("Failed to check GPS enabled", e6);
                return false;
            } catch (Exception e7) {
                h.d().g("io.rakam.api.DeviceInfo", "Error when checking for Google Play Services: " + e7);
                e.e().g("Failed to check GPS enabled", e7);
                return false;
            }
        }

        private String n() {
            if ("Amazon".equals(x())) {
                return o();
            }
            return p();
        }

        private String o() {
            ContentResolver contentResolver = d.this.f18450b.getContentResolver();
            this.f18461k = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1;
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            this.a = string;
            return string;
        }

        private String p() {
            try {
                boolean z = true;
                Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, d.this.f18450b);
                Boolean bool = (Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.f18461k = z;
                this.a = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            } catch (ClassNotFoundException e2) {
                h.d().g("io.rakam.api.DeviceInfo", "Google Play Services SDK not found!");
                e.e().g("Failed to get ADID", e2);
            } catch (InvocationTargetException e3) {
                h.d().g("io.rakam.api.DeviceInfo", "Google Play Services not available");
                e.e().g("Failed to get ADID", e3);
            } catch (Exception e4) {
                h.d().c("io.rakam.api.DeviceInfo", "Encountered an error connecting to Google Play Services", e4);
                e.e().g("Failed to get ADID", e4);
            }
            return this.a;
        }

        private String q() {
            return Build.BRAND;
        }

        private String r() {
            try {
                return ((TelephonyManager) d.this.f18450b.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception e2) {
                e.e().g("Failed to get carrier", e2);
                return null;
            }
        }

        private String s() {
            String u = u();
            if (!j.d(u)) {
                return u;
            }
            String v = v();
            return !j.d(v) ? v : t();
        }

        private String t() {
            return Locale.getDefault().getCountry();
        }

        private String u() {
            Location l;
            List<Address> fromLocation;
            if (d.this.r() && (l = d.this.l()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = d.this.h().getFromLocation(l.getLatitude(), l.getLongitude(), 1)) != null) {
                        for (Address address : fromLocation) {
                            if (address != null) {
                                return address.getCountryCode();
                            }
                        }
                    }
                } catch (IOException e2) {
                    e.e().g("Failed to get country from location", e2);
                } catch (IllegalArgumentException e3) {
                    e.e().g("Failed to get country from location", e3);
                } catch (IllegalStateException e4) {
                    e.e().g("Failed to get country from location", e4);
                } catch (NoSuchMethodError e5) {
                    e.e().g("Failed to get country from location", e5);
                } catch (NullPointerException e6) {
                    e.e().g("Failed to get country from location", e6);
                }
            }
            return null;
        }

        private String v() {
            String networkCountryIso;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) d.this.f18450b.getSystemService("phone");
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                return networkCountryIso.toUpperCase(Locale.US);
            } catch (Exception e2) {
                e.e().g("Failed to get country from network", e2);
                return null;
            }
        }

        private String w() {
            return Locale.getDefault().getLanguage();
        }

        private String x() {
            return Build.MANUFACTURER;
        }

        private String y() {
            return Build.MODEL;
        }

        private String z() {
            return "android";
        }

        private b() {
            this.a = n();
            this.f18453c = B();
            this.f18454d = z();
            this.f18455e = A();
            this.f18456f = q();
            this.f18457g = x();
            this.f18458h = y();
            this.f18459i = r();
            this.f18452b = s();
            this.f18460j = w();
            this.l = m();
        }
    }

    public d(Context context) {
        this.f18450b = context;
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    private b e() {
        if (this.f18451c == null) {
            this.f18451c = new b();
        }
        return this.f18451c;
    }

    public String c() {
        return e().a;
    }

    public String d() {
        return e().f18456f;
    }

    public String f() {
        return e().f18459i;
    }

    public String g() {
        return e().f18452b;
    }

    protected Geocoder h() {
        return new Geocoder(this.f18450b, Locale.ENGLISH);
    }

    public String i() {
        return e().f18460j;
    }

    public String j() {
        return e().f18457g;
    }

    public String k() {
        return e().f18458h;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.location.Location l() {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get most recent location"
            boolean r1 = r8.r()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            android.content.Context r1 = r8.f18450b
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 != 0) goto L17
            return r2
        L17:
            r3 = 1
            java.util.List r3 = r1.getProviders(r3)     // Catch: java.lang.SecurityException -> L1d
            goto L26
        L1d:
            r3 = move-exception
            io.rakam.api.e r4 = io.rakam.api.e.e()
            r4.g(r0, r3)
            r3 = r2
        L26:
            if (r3 != 0) goto L29
            return r2
        L29:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            android.location.Location r5 = r1.getLastKnownLocation(r5)     // Catch: java.lang.SecurityException -> L43 java.lang.IllegalArgumentException -> L4c
            goto L55
        L43:
            r5 = move-exception
            io.rakam.api.e r6 = io.rakam.api.e.e()
            r6.g(r0, r5)
            goto L54
        L4c:
            r5 = move-exception
            io.rakam.api.e r6 = io.rakam.api.e.e()
            r6.g(r0, r5)
        L54:
            r5 = r2
        L55:
            if (r5 == 0) goto L32
            r4.add(r5)
            goto L32
        L5b:
            r0 = -1
            java.util.Iterator r3 = r4.iterator()
        L61:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r3.next()
            android.location.Location r4 = (android.location.Location) r4
            long r5 = r4.getTime()
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L61
            long r0 = r4.getTime()
            r2 = r4
            goto L61
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.d.l():android.location.Location");
    }

    public String m() {
        return e().f18454d;
    }

    public String n() {
        return e().f18455e;
    }

    public String o() {
        return e().f18453c;
    }

    public boolean p() {
        return e().l;
    }

    public boolean q() {
        return e().f18461k;
    }

    public boolean r() {
        return this.a;
    }

    public void s() {
        e();
    }
}
