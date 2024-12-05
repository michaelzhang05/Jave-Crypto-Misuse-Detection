package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f15599a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f15600b;

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            java.lang.String r2 = "JobSchedulerCompat"
            r3 = 0
            r4 = 24
            if (r0 < r4) goto L34
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r5 = "scheduleAsPackage"
            r6 = 4
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobInfo> r7 = android.app.job.JobInfo.class
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r8 = 1
            r6[r8] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r9 = 2
            r6[r9] = r8     // Catch: java.lang.NoSuchMethodException -> L28
            r8 = 3
            r6[r8] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L35
        L28:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L34
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r2, r0)
        L34:
            r0 = r3
        L35:
            com.google.android.gms.internal.measurement.X.f15599a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L50
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r4 = "myUserId"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L44
            goto L50
        L44:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L50
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r2, r0)
        L50:
            com.google.android.gms.internal.measurement.X.f15600b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.X.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            r7 = 0
            java.lang.String r8 = "jobscheduler"
            java.lang.Object r8 = r5.getSystemService(r8)
            android.app.job.JobScheduler r8 = (android.app.job.JobScheduler) r8
            r8.getClass()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.X.f15599a
            if (r0 == 0) goto L76
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = androidx.core.app.q.a(r5, r0)
            if (r5 == 0) goto L19
            goto L76
        L19:
            java.lang.reflect.Method r5 = com.google.android.gms.internal.measurement.X.f15600b
            if (r5 == 0) goto L31
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            if (r5 == 0) goto L31
            int r5 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f
            goto L42
        L2d:
            r5 = move-exception
            goto L33
        L2f:
            r5 = move-exception
            goto L33
        L31:
            r5 = 0
            goto L42
        L33:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r5)
            goto L31
        L42:
            java.lang.String r0 = "UploadAlarm"
            java.lang.reflect.Method r1 = com.google.android.gms.internal.measurement.X.f15599a
            if (r1 == 0) goto L71
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            r2[r7] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            java.lang.String r3 = "com.google.android.gms"
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            r3 = 2
            r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            r5 = 3
            r2[r5] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            java.lang.Object r5 = r1.invoke(r8, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            if (r5 == 0) goto L75
            int r7 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L69 java.lang.IllegalAccessException -> L6b
            goto L75
        L69:
            r5 = move-exception
            goto L6c
        L6b:
            r5 = move-exception
        L6c:
            java.lang.String r7 = "error calling scheduleAsPackage"
            android.util.Log.e(r0, r7, r5)
        L71:
            int r7 = r8.schedule(r6)
        L75:
            return r7
        L76:
            int r5 = r8.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.X.a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
