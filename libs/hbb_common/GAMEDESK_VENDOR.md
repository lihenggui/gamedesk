# GameDesk vendored hbb_common

This directory is vendored so a normal clone can build without initializing a
Git submodule.

- Upstream: `https://github.com/rustdesk/hbb_common`
- Upstream revision: `daf84c2df33b3d5861d9a36600773638559d072c`
- GameDesk changes: default `APP_NAME` and an optional build-time
  `GAMEDESK_PORT_OFFSET`. GitHub Actions reads it from a repository Actions
  Secret; an unset value preserves upstream ports. The window-capture protocol
  messages now live in `libs/base/protos/message.proto`.

To update it, export the desired upstream revision without its `.git`
directory, replace this directory, then reapply the GameDesk changes and
update the revision above. Do not copy a nested Git repository into this path.