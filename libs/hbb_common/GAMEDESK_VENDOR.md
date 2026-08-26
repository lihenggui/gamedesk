# GameDesk vendored hbb_common

This directory is vendored so a normal clone can build without initializing a
Git submodule.

- Upstream: `https://github.com/rustdesk/hbb_common`
- Upstream revision: `7e1c392c62d39c364127307cd408421dd5f8cfb0`
- GameDesk changes: default `APP_NAME` and window-capture protocol messages.

To update it, export the desired upstream revision without its `.git`
directory, replace this directory, then reapply the two GameDesk changes and
update the revision above. Do not copy a nested Git repository into this path.
