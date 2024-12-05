package i4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f7010a;

    public q(Context context, String str) {
        this.f7010a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j6 = this.f7010a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f7010a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f7010a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f7010a.edit().putStringSet(str, hashSet).putLong("fire-count", j6 - 1).commit();
    }

    private synchronized String d(long j6) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j6));
        }
        instant = new Date(j6).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f7010a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        String e6 = e(str);
        if (e6 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f7010a.getStringSet(e6, new HashSet()));
        hashSet.remove(str);
        (hashSet.isEmpty() ? this.f7010a.edit().remove(e6) : this.f7010a.edit().putStringSet(e6, hashSet)).commit();
    }

    private synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f7010a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f7010a.edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        SharedPreferences.Editor edit = this.f7010a.edit();
        for (Map.Entry<String, ?> entry : this.f7010a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f7010a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(r.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    synchronized boolean f(long j6, long j7) {
        return d(j6).equals(d(j7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        String d6 = d(System.currentTimeMillis());
        this.f7010a.edit().putString("last-used-date", d6).commit();
        h(d6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean i(long j6) {
        return j("fire-global", j6);
    }

    synchronized boolean j(String str, long j6) {
        if (!this.f7010a.contains(str)) {
            this.f7010a.edit().putLong(str, j6).commit();
            return true;
        }
        if (f(this.f7010a.getLong(str, -1L), j6)) {
            return false;
        }
        this.f7010a.edit().putLong(str, j6).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void k(long j6, String str) {
        String d6 = d(j6);
        if (this.f7010a.getString("last-used-date", "").equals(d6)) {
            String e6 = e(d6);
            if (e6 == null) {
                return;
            }
            if (e6.equals(str)) {
                return;
            }
            m(str, d6);
            return;
        }
        long j7 = this.f7010a.getLong("fire-count", 0L);
        if (j7 + 1 == 30) {
            a();
            j7 = this.f7010a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f7010a.getStringSet(str, new HashSet()));
        hashSet.add(d6);
        this.f7010a.edit().putStringSet(str, hashSet).putLong("fire-count", j7 + 1).putString("last-used-date", d6).commit();
    }

    synchronized void l(long j6) {
        this.f7010a.edit().putLong("fire-global", j6).commit();
    }
}
