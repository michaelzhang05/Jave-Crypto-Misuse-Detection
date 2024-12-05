package w0;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9729a = "w0.j";

    private static void d(File file, File file2) {
        FileChannel fileChannel;
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            throw new IOException("failed in creating directory");
        }
        if (!file2.exists() && !file2.createNewFile()) {
            throw new IOException("failed in creating new file");
        }
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                fileChannel2 = new FileOutputStream(file2).getChannel();
                fileChannel2.transferFrom(channel, 0L, channel.size());
                channel.close();
                fileChannel2.close();
            } catch (Throwable th) {
                th = th;
                FileChannel fileChannel3 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel3;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }

    public String a(String str) {
        if (p(str, "SQLite.db")) {
            return str;
        }
        return str.substring(0, str.length() - 3) + "SQLite.db";
    }

    public void b(AssetManager assetManager, String str, String str2) {
        try {
            byte[] bArr = new byte[1024];
            InputStream open = assetManager.open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            while (true) {
                int read = open.read(bArr);
                if (read <= 0) {
                    fileOutputStream.close();
                    fileOutputStream.flush();
                    open.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e6) {
            throw new IOException("in copyDatabaseFromAssets " + e6.getLocalizedMessage());
        }
    }

    public Boolean c(Context context, String str, String str2) {
        File databasePath = context.getDatabasePath(str);
        File databasePath2 = context.getDatabasePath(str2);
        try {
            if (!databasePath2.exists() && !databasePath2.createNewFile()) {
                throw new Exception("Cannot create file" + str);
            }
            d(databasePath, databasePath2);
            return Boolean.TRUE;
        } catch (Exception e6) {
            Log.e(f9729a, "Error: in copyFile " + e6);
            return Boolean.FALSE;
        }
    }

    public void e(Context context, Boolean bool) {
        AssetManager assets = context.getAssets();
        try {
            String absolutePath = new File(context.getFilesDir().getParentFile(), "databases").getAbsolutePath();
            File file = new File(absolutePath);
            if (!file.isDirectory() && !file.mkdir()) {
                throw new Exception("Cannot create dir" + absolutePath);
            }
            String[] list = assets.list("public/assets/databases");
            if (list.length == 0) {
                throw new Exception("Folder public/assets/databases does not exist or is empty");
            }
            for (String str : list) {
                if (p(str, ".db")) {
                    String a6 = a(str);
                    boolean booleanValue = o(context, a6).booleanValue();
                    if (!booleanValue || bool.booleanValue()) {
                        if (bool.booleanValue() && booleanValue) {
                            h(context, a6);
                        }
                        b(assets, "public/assets/databases/" + str, context.getDatabasePath(a6).getAbsolutePath());
                    }
                }
                if (p(str, ".zip")) {
                    u(l(context), assets, "public/assets/databases/" + str, bool);
                }
            }
        } catch (IOException e6) {
            throw new Exception("in copyFromAssetsToDatabase " + e6.getLocalizedMessage());
        }
    }

    public Boolean f(Context context, String str, String str2, String str3, String str4) {
        File file = new File(str, str2);
        File databasePath = context.getDatabasePath(str4);
        try {
            if (databasePath.exists() || databasePath.createNewFile()) {
                d(file, databasePath);
                return Boolean.TRUE;
            }
            Log.e(f9729a, "Error: in toFile " + str4);
            return Boolean.FALSE;
        } catch (Exception e6) {
            Log.e(f9729a, "Error: in copyFile " + e6);
            return Boolean.FALSE;
        }
    }

    public Boolean g(Context context, String str) {
        String str2;
        if (o(context, "backup-" + str).booleanValue()) {
            if (i(context, "backup-" + str).booleanValue()) {
                return Boolean.TRUE;
            }
            str2 = "Error: deleteBackupDB: delete file backup-" + str;
        } else {
            str2 = ("Error: deleteBackupDB: backup-" + str) + " does not exist";
        }
        Log.e(f9729a, str2);
        return Boolean.FALSE;
    }

    public Boolean h(Context context, String str) {
        context.deleteDatabase(str);
        return o(context, str).booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

    public Boolean i(Context context, String str) {
        return Boolean.valueOf(context.getDatabasePath(str).delete());
    }

    public Boolean j(File file) {
        return Boolean.valueOf(file.delete());
    }

    public Boolean k(String str, String str2) {
        return Boolean.valueOf(new File(str, str2).delete());
    }

    public String l(Context context) {
        return (context == null || context.getDatabasePath("x") == null) ? "" : context.getDatabasePath("x").getParent();
    }

    public String m(String str) {
        return (str.lastIndexOf(".") == -1 || str.lastIndexOf(".") == 0) ? "" : str.substring(str.lastIndexOf(".") + 1);
    }

    public String[] n(Context context) {
        String[] databaseList = context.databaseList();
        ArrayList arrayList = new ArrayList();
        for (String str : databaseList) {
            if (str.endsWith("SQLite.db")) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public Boolean o(Context context, String str) {
        return Boolean.valueOf(context.getDatabasePath(str).exists());
    }

    public boolean p(String str, String str2) {
        int length = str2.length();
        return str.length() > length && str.substring(str.length() - length).equals(str2);
    }

    public Boolean q(String str) {
        return new File(str).exists() ? Boolean.TRUE : Boolean.FALSE;
    }

    public List r(File file) {
        ArrayList arrayList = new ArrayList();
        if (!file.exists()) {
            throw new Exception("File " + file.getAbsolutePath() + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new Exception("File " + file.getAbsolutePath() + " is not a directory");
        }
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                String name = file2.getName();
                if (m(name).equals("db")) {
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    public void s(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        try {
            for (String str : r(file)) {
                File file3 = new File(absolutePath2, str);
                if (q(file3.getAbsolutePath()).booleanValue()) {
                    j(file3);
                }
                if (!Boolean.valueOf(new File(absolutePath, str).renameTo(file3)).booleanValue()) {
                    throw new Exception("moveAllDBs: move file " + str + " failed");
                }
            }
        } catch (Exception e6) {
            throw new Exception(e6.getMessage());
        }
    }

    public Boolean t(Context context, String str) {
        String str2;
        StringBuilder sb;
        if (o(context, "backup-" + str).booleanValue()) {
            if (!o(context, str).booleanValue()) {
                sb = new StringBuilder();
                sb.append("Error: restoreDatabase: database ");
                sb.append(str);
                str = "does not exists";
            } else if (i(context, str).booleanValue()) {
                if (c(context, "backup-" + str, str).booleanValue()) {
                    if (i(context, "backup-" + str).booleanValue()) {
                        return Boolean.TRUE;
                    }
                    sb = new StringBuilder();
                    sb.append("Error: restoreDatabase: delete file ");
                    sb.append("backup-");
                } else {
                    sb = new StringBuilder();
                    sb.append("Error: restoreDatabase: copy file ");
                }
            } else {
                sb = new StringBuilder();
                sb.append("Error: restoreDatabase: delete file ");
            }
            sb.append(str);
            str2 = sb.toString();
        } else {
            str2 = ("Error: restoreDB: backup-" + str) + " does not exist";
        }
        Log.e(f9729a, str2);
        return Boolean.FALSE;
    }

    public void u(String str, AssetManager assetManager, String str2, Boolean bool) {
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream;
        byte[] bArr = new byte[1024];
        InputStream inputStream = null;
        try {
            if (assetManager != null) {
                InputStream open = assetManager.open(str2);
                zipInputStream = new ZipInputStream(open);
                inputStream = open;
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(new File(str2));
                zipInputStream = new ZipInputStream(fileInputStream);
            }
            loop0: while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (p(name, ".db")) {
                        String a6 = a(name);
                        String str3 = str + File.separator + a6;
                        boolean booleanValue = q(str3).booleanValue();
                        if (!booleanValue || bool.booleanValue()) {
                            if (bool.booleanValue() && booleanValue) {
                                k(str, a6);
                            }
                            File file = new File(str3);
                            System.out.println("Unzipping to " + file.getAbsolutePath());
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            while (true) {
                                int read = zipInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, read);
                                }
                            }
                            fileOutputStream.close();
                        }
                        zipInputStream.closeEntry();
                    }
                }
                break loop0;
            }
            zipInputStream.closeEntry();
            zipInputStream.close();
            if (assetManager != null && inputStream != null) {
                inputStream.close();
            } else if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e6) {
            throw new IOException("in unzipCopyDatabase " + e6.getLocalizedMessage());
        }
    }
}
