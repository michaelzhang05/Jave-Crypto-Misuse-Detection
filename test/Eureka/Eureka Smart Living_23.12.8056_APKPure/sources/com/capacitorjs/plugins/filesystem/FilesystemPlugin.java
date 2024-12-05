package com.capacitorjs.plugins.filesystem;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.getcapacitor.a1;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import com.getcapacitor.l0;
import com.getcapacitor.r0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import org.json.JSONException;
import t3.b0;
import z0.d;

@v0.b(name = "Filesystem", permissions = {@v0.c(alias = FilesystemPlugin.PUBLIC_STORAGE, strings = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})})
/* loaded from: classes.dex */
public class FilesystemPlugin extends u0 {
    private static final String PERMISSION_DENIED_ERROR = "Unable to do file operation, user denied permission request";
    static final String PUBLIC_STORAGE = "publicStorage";
    private a implementation;

    private void _copy(v0 v0Var, Boolean bool) {
        String message;
        String n6 = v0Var.n("from");
        String n7 = v0Var.n("to");
        String n8 = v0Var.n("directory");
        String n9 = v0Var.n("toDirectory");
        if (n6 == null || n6.isEmpty() || n7 == null || n7.isEmpty()) {
            v0Var.r("Both to and from must be provided");
            return;
        }
        if ((isPublicDirectory(n8) || isPublicDirectory(n9)) && !isStoragePermissionGranted()) {
            requestAllPermissions(v0Var, "permissionCallback");
            return;
        }
        try {
            File a6 = this.implementation.a(n6, n8, n7, n9, bool.booleanValue());
            if (bool.booleanValue()) {
                v0Var.w();
                return;
            }
            j0 j0Var = new j0();
            j0Var.m("uri", Uri.fromFile(a6).toString());
            v0Var.x(j0Var);
        } catch (IOException e6) {
            message = "Unable to perform action: " + e6.getLocalizedMessage();
            v0Var.r(message);
        } catch (q0.a e7) {
            message = e7.getMessage();
            v0Var.r(message);
        }
    }

    private String getDirectoryParameter(v0 v0Var) {
        return v0Var.n("directory");
    }

    private boolean isPublicDirectory(String str) {
        return "DOCUMENTS".equals(str) || "EXTERNAL_STORAGE".equals(str);
    }

    private boolean isStoragePermissionGranted() {
        return Build.VERSION.SDK_INT >= 30 || getPermissionState(PUBLIC_STORAGE) == r0.GRANTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadFile$0(v0 v0Var, Integer num, Integer num2) {
        j0 j0Var = new j0();
        j0Var.m("url", v0Var.n("url"));
        j0Var.put("bytes", num);
        j0Var.put("contentLength", num2);
        notifyListeners("progress", j0Var);
    }

    @v0.d
    private void permissionCallback(v0 v0Var) {
        if (!isStoragePermissionGranted()) {
            l0.b(getLogTag(), "User denied storage permission");
            v0Var.r(PERMISSION_DENIED_ERROR);
            return;
        }
        String k6 = v0Var.k();
        k6.hashCode();
        char c6 = 65535;
        switch (k6.hashCode()) {
            case -2139808842:
                if (k6.equals("appendFile")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1406748165:
                if (k6.equals("writeFile")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1249348042:
                if (k6.equals("getUri")) {
                    c6 = 2;
                    break;
                }
                break;
            case -934594754:
                if (k6.equals("rename")) {
                    c6 = 3;
                    break;
                }
                break;
            case -867956686:
                if (k6.equals("readFile")) {
                    c6 = 4;
                    break;
                }
                break;
            case 3059573:
                if (k6.equals("copy")) {
                    c6 = 5;
                    break;
                }
                break;
            case 3540564:
                if (k6.equals("stat")) {
                    c6 = 6;
                    break;
                }
                break;
            case 103950895:
                if (k6.equals("mkdir")) {
                    c6 = 7;
                    break;
                }
                break;
            case 108628082:
                if (k6.equals("rmdir")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 1080408887:
                if (k6.equals("readdir")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1108651556:
                if (k6.equals("downloadFile")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1764172231:
                if (k6.equals("deleteFile")) {
                    c6 = 11;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 1:
                writeFile(v0Var);
                return;
            case 2:
                getUri(v0Var);
                return;
            case 3:
                rename(v0Var);
                return;
            case 4:
                readFile(v0Var);
                return;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                copy(v0Var);
                return;
            case 6:
                stat(v0Var);
                return;
            case 7:
                mkdir(v0Var);
                return;
            case '\b':
                rmdir(v0Var);
                return;
            case '\t':
                readdir(v0Var);
                return;
            case '\n':
                downloadFile(v0Var);
                return;
            case 11:
                deleteFile(v0Var);
                return;
            default:
                return;
        }
    }

    private void saveFile(v0 v0Var, File file, String str) {
        String str2;
        String n6 = v0Var.n("encoding");
        boolean booleanValue = v0Var.f("append", Boolean.FALSE).booleanValue();
        Charset g6 = this.implementation.g(n6);
        if (n6 != null && g6 == null) {
            v0Var.r("Unsupported encoding provided: " + n6);
            return;
        }
        try {
            this.implementation.o(file, str, g6, Boolean.valueOf(booleanValue));
            if (isPublicDirectory(getDirectoryParameter(v0Var))) {
                MediaScannerConnection.scanFile(getContext(), new String[]{file.getAbsolutePath()}, null, null);
            }
            l0.b(getLogTag(), "File '" + file.getAbsolutePath() + "' saved!");
            j0 j0Var = new j0();
            j0Var.m("uri", Uri.fromFile(file).toString());
            v0Var.x(j0Var);
        } catch (IOException e6) {
            l0.d(getLogTag(), "Creating file '" + file.getPath() + "' with charset '" + g6 + "' failed. Error: " + e6.getMessage(), e6);
            str2 = "FILE_NOTCREATED";
            v0Var.r(str2);
        } catch (IllegalArgumentException unused) {
            str2 = "The supplied data is not valid base64 content.";
            v0Var.r(str2);
        }
    }

    @a1
    public void appendFile(v0 v0Var) {
        try {
            v0Var.h().putOpt("append", Boolean.TRUE);
        } catch (JSONException unused) {
        }
        writeFile(v0Var);
    }

    @Override // com.getcapacitor.u0
    @a1
    public void checkPermissions(v0 v0Var) {
        if (!isStoragePermissionGranted()) {
            super.checkPermissions(v0Var);
            return;
        }
        j0 j0Var = new j0();
        j0Var.m(PUBLIC_STORAGE, "granted");
        v0Var.x(j0Var);
    }

    @a1
    public void copy(v0 v0Var) {
        _copy(v0Var, Boolean.FALSE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:12:0x0036). Please report as a decompilation issue!!! */
    @a1
    public void deleteFile(v0 v0Var) {
        String n6 = v0Var.n("path");
        String directoryParameter = getDirectoryParameter(v0Var);
        if (isPublicDirectory(directoryParameter) && !isStoragePermissionGranted()) {
            requestAllPermissions(v0Var, "permissionCallback");
            return;
        }
        try {
            if (this.implementation.c(n6, directoryParameter)) {
                v0Var.w();
            } else {
                v0Var.r("Unable to delete file");
            }
        } catch (FileNotFoundException e6) {
            v0Var.r(e6.getMessage());
        }
    }

    @a1
    public void downloadFile(final v0 v0Var) {
        try {
            String o6 = v0Var.o("directory", Environment.DIRECTORY_DOWNLOADS);
            if (isPublicDirectory(o6) && !isStoragePermissionGranted()) {
                requestAllPermissions(v0Var, "permissionCallback");
                return;
            }
            j0 e6 = this.implementation.e(v0Var, this.bridge, new d.c() { // from class: com.capacitorjs.plugins.filesystem.g
                @Override // z0.d.c
                public final void a(Integer num, Integer num2) {
                    FilesystemPlugin.this.lambda$downloadFile$0(v0Var, num, num2);
                }
            });
            if (isPublicDirectory(o6)) {
                MediaScannerConnection.scanFile(getContext(), new String[]{e6.getString("path")}, null, null);
            }
            v0Var.x(e6);
        } catch (Exception e7) {
            v0Var.s("Error downloading file: " + e7.getLocalizedMessage(), e7);
        }
    }

    @a1
    public void getUri(v0 v0Var) {
        String n6 = v0Var.n("path");
        String directoryParameter = getDirectoryParameter(v0Var);
        File h6 = this.implementation.h(n6, directoryParameter);
        if (isPublicDirectory(directoryParameter) && !isStoragePermissionGranted()) {
            requestAllPermissions(v0Var, "permissionCallback");
            return;
        }
        j0 j0Var = new j0();
        j0Var.m("uri", Uri.fromFile(h6).toString());
        v0Var.x(j0Var);
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.implementation = new a(getContext());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:12:0x0046). Please report as a decompilation issue!!! */
    @a1
    public void mkdir(v0 v0Var) {
        String n6 = v0Var.n("path");
        String directoryParameter = getDirectoryParameter(v0Var);
        boolean booleanValue = v0Var.f("recursive", Boolean.FALSE).booleanValue();
        if (isPublicDirectory(directoryParameter) && !isStoragePermissionGranted()) {
            requestAllPermissions(v0Var, "permissionCallback");
            return;
        }
        try {
            if (this.implementation.j(n6, directoryParameter, Boolean.valueOf(booleanValue))) {
                v0Var.w();
            } else {
                v0Var.r("Unable to create directory, unknown reason");
            }
        } catch (q0.b e6) {
            v0Var.r(e6.getMessage());
        }
    }

    @a1
    public void readFile(v0 v0Var) {
        String str;
        String n6 = v0Var.n("path");
        String directoryParameter = getDirectoryParameter(v0Var);
        String n7 = v0Var.n("encoding");
        Charset g6 = this.implementation.g(n7);
        if (n7 != null && g6 == null) {
            v0Var.r("Unsupported encoding provided: " + n7);
            return;
        }
        if (isPublicDirectory(directoryParameter) && !isStoragePermissionGranted()) {
            requestAllPermissions(v0Var, "permissionCallback");
            return;
        }
        try {
            String k6 = this.implementation.k(n6, directoryParameter, g6);
            j0 j0Var = new j0();
            j0Var.putOpt("data", k6);
            v0Var.x(j0Var);
        } catch (FileNotFoundException e6) {
            e = e6;
            str = "File does not exist";
            v0Var.s(str, e);
        } catch (IOException e7) {
            e = e7;
            str = "Unable to read file";
            v0Var.s(str, e);
        } catch (JSONException e8) {
            e = e8;
            str = "Unable to return value for reading file";
            v0Var.s(str, e);
        }
    }

    @a1
    public void readdir(v0 v0Var) {
        Path path;
        BasicFileAttributes readAttributes;
        FileTime creationTime;
        long millis;
        FileTime lastAccessTime;
        long millis2;
        FileTime lastAccessTime2;
        long millis3;
        FileTime creationTime2;
        String n6 = v0Var.n("path");
        String directoryParameter = getDirectoryParameter(v0Var);
        if (isPublicDirectory(directoryParameter) && !isStoragePermissionGranted()) {
            requestAllPermissions(v0Var, "permissionCallback");
            return;
        }
        try {
            File[] n7 = this.implementation.n(n6, directoryParameter);
            g0 g0Var = new g0();
            if (n7 == null) {
                v0Var.r("Unable to read directory");
                return;
            }
            for (File file : n7) {
                j0 j0Var = new j0();
                j0Var.m("name", file.getName());
                j0Var.m("type", file.isDirectory() ? "directory" : "file");
                j0Var.put("size", file.length());
                j0Var.put("mtime", file.lastModified());
                j0Var.m("uri", Uri.fromFile(file).toString());
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        path = file.toPath();
                        readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, new LinkOption[0]);
                        creationTime = readAttributes.creationTime();
                        millis = creationTime.toMillis();
                        lastAccessTime = readAttributes.lastAccessTime();
                        millis2 = lastAccessTime.toMillis();
                        if (millis < millis2) {
                            creationTime2 = readAttributes.creationTime();
                            millis3 = creationTime2.toMillis();
                        } else {
                            lastAccessTime2 = readAttributes.lastAccessTime();
                            millis3 = lastAccessTime2.toMillis();
                        }
                        j0Var.put("ctime", millis3);
                    } catch (Exception unused) {
                    }
                } else {
                    j0Var.m("ctime", null);
                }
                g0Var.put(j0Var);
            }
            j0 j0Var2 = new j0();
            j0Var2.put("files", g0Var);
            v0Var.x(j0Var2);
        } catch (q0.c e6) {
            v0Var.r(e6.getMessage());
        }
    }

    @a1
    public void rename(v0 v0Var) {
        _copy(v0Var, Boolean.TRUE);
    }

    @Override // com.getcapacitor.u0
    @a1
    public void requestPermissions(v0 v0Var) {
        if (!isStoragePermissionGranted()) {
            super.requestPermissions(v0Var);
            return;
        }
        j0 j0Var = new j0();
        j0Var.m(PUBLIC_STORAGE, "granted");
        v0Var.x(j0Var);
    }

    @a1
    public void rmdir(v0 v0Var) {
        boolean z5;
        String str;
        String n6 = v0Var.n("path");
        String directoryParameter = getDirectoryParameter(v0Var);
        Boolean f6 = v0Var.f("recursive", Boolean.FALSE);
        File h6 = this.implementation.h(n6, directoryParameter);
        if (isPublicDirectory(directoryParameter) && !isStoragePermissionGranted()) {
            requestAllPermissions(v0Var, "permissionCallback");
            return;
        }
        if (!h6.exists()) {
            str = "Directory does not exist";
        } else {
            if (!h6.isDirectory() || h6.listFiles().length == 0 || f6.booleanValue()) {
                try {
                    this.implementation.d(h6);
                    z5 = true;
                } catch (IOException unused) {
                    z5 = false;
                }
                if (z5) {
                    v0Var.w();
                    return;
                } else {
                    v0Var.r("Unable to delete directory, unknown reason");
                    return;
                }
            }
            str = "Directory is not empty";
        }
        v0Var.r(str);
    }

    @a1
    public void stat(v0 v0Var) {
        Path path;
        BasicFileAttributes readAttributes;
        FileTime creationTime;
        long millis;
        FileTime lastAccessTime;
        long millis2;
        FileTime lastAccessTime2;
        long millis3;
        FileTime creationTime2;
        String n6 = v0Var.n("path");
        String directoryParameter = getDirectoryParameter(v0Var);
        File h6 = this.implementation.h(n6, directoryParameter);
        if (isPublicDirectory(directoryParameter) && !isStoragePermissionGranted()) {
            requestAllPermissions(v0Var, "permissionCallback");
            return;
        }
        if (!h6.exists()) {
            v0Var.r("File does not exist");
            return;
        }
        j0 j0Var = new j0();
        j0Var.m("type", h6.isDirectory() ? "directory" : "file");
        j0Var.put("size", h6.length());
        j0Var.put("mtime", h6.lastModified());
        j0Var.m("uri", Uri.fromFile(h6).toString());
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                path = h6.toPath();
                readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, new LinkOption[0]);
                creationTime = readAttributes.creationTime();
                millis = creationTime.toMillis();
                lastAccessTime = readAttributes.lastAccessTime();
                millis2 = lastAccessTime.toMillis();
                if (millis < millis2) {
                    creationTime2 = readAttributes.creationTime();
                    millis3 = creationTime2.toMillis();
                } else {
                    lastAccessTime2 = readAttributes.lastAccessTime();
                    millis3 = lastAccessTime2.toMillis();
                }
                j0Var.put("ctime", millis3);
            } catch (Exception unused) {
            }
        } else {
            j0Var.m("ctime", null);
        }
        v0Var.x(j0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r3.getParentFile().mkdirs() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
    
        if (r3.getParentFile().mkdirs() == false) goto L31;
     */
    @com.getcapacitor.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeFile(com.getcapacitor.v0 r9) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.capacitorjs.plugins.filesystem.FilesystemPlugin.writeFile(com.getcapacitor.v0):void");
    }
}
