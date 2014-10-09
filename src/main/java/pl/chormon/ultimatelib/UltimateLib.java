/*
 * The MIT License
 *
 * Copyright 2014 Chormon.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pl.chormon.ultimatelib;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import pl.chormon.ultimatelib.utils.MsgUtils;

/**
 *
 * @author Chormon
 */
public class UltimateLib extends JavaPlugin {
    
    protected PluginDescriptionFile pdf;
    protected MsgUtils msgUtils;

    @Override
    public void onEnable() {
        pdf = this.getDescription();
        msgUtils = new MsgUtils();
        msgUtils.setConsole(Bukkit.getConsoleSender());
        msgUtils.info("{name} {version} enabled!", "{name}", pdf.getName(), "{version}", pdf.getVersion());
    }

    @Override
    public void onDisable() {
        msgUtils.info("{name} {version} disabled!", "{name}", pdf.getName(), "{version}", pdf.getVersion());      
    }

    public void info(String msg) {
        msgUtils.info(msg, (Object) null);
    }

    public void info(String msg, Object... vars) {
        msgUtils.info(msg, vars);
    }

    public void warning(String msg) {
        msgUtils.warning(msg, (Object) null);
    }

    public void warning(String msg, Object... vars) {
        msgUtils.warning(msg, vars);
    }

    public void error(String msg) {
        msgUtils.error(msg, (Object) null);
    }

    public void error(String msg, Object... vars) {
        msgUtils.error(msg, vars);
    }
    
}
