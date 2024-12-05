package com.mbridge.msdk.foundation.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.controller.d;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18997a = "a";

    /* renamed from: d, reason: collision with root package name */
    private static a f18998d;

    /* renamed from: b, reason: collision with root package name */
    FastKV f18999b;

    /* renamed from: c, reason: collision with root package name */
    SharedPreferences f19000c;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19001e;

    private a() {
        d.a();
        this.f19001e = true;
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f18998d == null) {
                    f18998d = new a();
                }
                aVar = f18998d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final Long b(String str) {
        try {
            Context c8 = c.m().c();
            if (c8 == null) {
                ad.b(f18997a, "context is null in get");
                return 0L;
            }
            if (this.f19001e && this.f18999b == null) {
                try {
                    this.f18999b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.f18999b = null;
                }
            }
            FastKV fastKV = this.f18999b;
            if (fastKV != null) {
                try {
                    return Long.valueOf(fastKV.getLong(str, 0L));
                } catch (Exception unused2) {
                    return 0L;
                }
            }
            if (this.f19000c == null) {
                this.f19000c = c8.getSharedPreferences("mbridge", 0);
            }
            return Long.valueOf(this.f19000c.getLong(str, 0L));
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    public final void c(String str) {
        Context c8 = c.m().c();
        if (c8 == null) {
            return;
        }
        if (this.f19001e && this.f18999b == null) {
            try {
                this.f18999b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.f18999b = null;
            }
        }
        FastKV fastKV = this.f18999b;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused2) {
            }
        } else {
            if (this.f19000c == null) {
                this.f19000c = c8.getSharedPreferences("mbridge", 0);
            }
            this.f19000c.edit().remove(str).apply();
        }
    }

    public final String a(String str) {
        try {
            Context c8 = c.m().c();
            if (c8 == null) {
                return null;
            }
            if (this.f19001e && this.f18999b == null) {
                try {
                    this.f18999b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.f18999b = null;
                }
            }
            FastKV fastKV = this.f18999b;
            if (fastKV != null) {
                try {
                    return fastKV.getString(str, "");
                } catch (Exception unused2) {
                    return "";
                }
            }
            if (this.f19000c == null) {
                this.f19000c = c8.getSharedPreferences("mbridge", 0);
            }
            return this.f19000c.getString(str, "");
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final int a(String str, int i8) {
        try {
            Context c8 = c.m().c();
            if (c8 == null) {
                return i8;
            }
            if (this.f19001e && this.f18999b == null) {
                try {
                    this.f18999b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.f18999b = null;
                }
            }
            FastKV fastKV = this.f18999b;
            if (fastKV != null) {
                try {
                    return fastKV.getInt(str, i8);
                } catch (Exception unused2) {
                    return i8;
                }
            }
            if (this.f19000c == null) {
                this.f19000c = c8.getSharedPreferences("mbridge", 0);
            }
            return this.f19000c.getInt(str, i8);
        } catch (Exception e8) {
            e8.printStackTrace();
            return i8;
        }
    }

    public final void b(String str, int i8) {
        try {
            Context c8 = c.m().c();
            if (c8 == null) {
                return;
            }
            if (this.f19001e && this.f18999b == null) {
                try {
                    this.f18999b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.f18999b = null;
                }
            }
            FastKV fastKV = this.f18999b;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i8);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            if (this.f19000c == null) {
                this.f19000c = c8.getSharedPreferences("mbridge", 0);
            }
            SharedPreferences.Editor edit = this.f19000c.edit();
            edit.putInt(str, i8);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str, String str2) {
        try {
            Context c8 = c.m().c();
            if (c8 == null) {
                return;
            }
            if (this.f19001e && this.f18999b == null) {
                try {
                    this.f18999b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.f18999b = null;
                }
            }
            FastKV fastKV = this.f18999b;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            if (this.f19000c == null) {
                this.f19000c = c8.getSharedPreferences("mbridge", 0);
            }
            SharedPreferences.Editor edit = this.f19000c.edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str, long j8) {
        try {
            Context c8 = c.m().c();
            if (c8 == null) {
                ad.b(f18997a, "context is null in put");
                return;
            }
            if (this.f19001e && this.f18999b == null) {
                try {
                    this.f18999b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.f18999b = null;
                }
            }
            FastKV fastKV = this.f18999b;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j8);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            if (this.f19000c == null) {
                this.f19000c = c8.getSharedPreferences("mbridge", 0);
            }
            SharedPreferences.Editor edit = this.f19000c.edit();
            edit.putLong(str, j8);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
