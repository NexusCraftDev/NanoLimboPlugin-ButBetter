package ua.nanit.limbo.server.commands;

import ua.nanit.limbo.server.Command;
import ua.nanit.limbo.server.Log;
import ua.nanit.limbo.BuildConfig;

public class CmdVersion implements Command {

    @Override
    public void execute() {
        Log.info("Version: %s", BuildConfig.LIMBO_VERSION);
    }

    @Override
    public String description() {
        return "Display limbo version";
    }
}
